package fr.spacefox.perftests.quarkus.core.service614;

import fr.spacefox.perftests.quarkus.core.port.data.Entity614DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service614.model.Model614;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service614 {

    private final Entity614DatasourcePort datasource;

    public Service614(Entity614DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model614 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
