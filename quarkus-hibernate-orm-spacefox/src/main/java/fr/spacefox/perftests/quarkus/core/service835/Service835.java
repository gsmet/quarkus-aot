package fr.spacefox.perftests.quarkus.core.service835;

import fr.spacefox.perftests.quarkus.core.port.data.Entity835DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service835.model.Model835;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service835 {

    private final Entity835DatasourcePort datasource;

    public Service835(Entity835DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model835 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
