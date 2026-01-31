package fr.spacefox.perftests.quarkus.core.service928;

import fr.spacefox.perftests.quarkus.core.port.data.Entity928DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service928.model.Model928;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service928 {

    private final Entity928DatasourcePort datasource;

    public Service928(Entity928DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model928 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
