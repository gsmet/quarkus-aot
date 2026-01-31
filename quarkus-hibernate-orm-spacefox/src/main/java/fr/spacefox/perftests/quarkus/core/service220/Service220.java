package fr.spacefox.perftests.quarkus.core.service220;

import fr.spacefox.perftests.quarkus.core.port.data.Entity220DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service220.model.Model220;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service220 {

    private final Entity220DatasourcePort datasource;

    public Service220(Entity220DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model220 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
