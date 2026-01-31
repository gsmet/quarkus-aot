package fr.spacefox.perftests.quarkus.core.service681;

import fr.spacefox.perftests.quarkus.core.port.data.Entity681DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service681.model.Model681;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service681 {

    private final Entity681DatasourcePort datasource;

    public Service681(Entity681DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model681 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
