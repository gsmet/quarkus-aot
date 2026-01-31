package fr.spacefox.perftests.quarkus.core.service538;

import fr.spacefox.perftests.quarkus.core.port.data.Entity538DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service538.model.Model538;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service538 {

    private final Entity538DatasourcePort datasource;

    public Service538(Entity538DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model538 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
