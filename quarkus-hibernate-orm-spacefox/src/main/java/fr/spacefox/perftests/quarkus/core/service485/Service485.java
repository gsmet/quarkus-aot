package fr.spacefox.perftests.quarkus.core.service485;

import fr.spacefox.perftests.quarkus.core.port.data.Entity485DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service485.model.Model485;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service485 {

    private final Entity485DatasourcePort datasource;

    public Service485(Entity485DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model485 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
