package fr.spacefox.perftests.quarkus.core.service361;

import fr.spacefox.perftests.quarkus.core.port.data.Entity361DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service361.model.Model361;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service361 {

    private final Entity361DatasourcePort datasource;

    public Service361(Entity361DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model361 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
