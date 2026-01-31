package fr.spacefox.perftests.quarkus.core.service782;

import fr.spacefox.perftests.quarkus.core.port.data.Entity782DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service782.model.Model782;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service782 {

    private final Entity782DatasourcePort datasource;

    public Service782(Entity782DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model782 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
