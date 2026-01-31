package fr.spacefox.perftests.quarkus.core.service32;

import fr.spacefox.perftests.quarkus.core.port.data.Entity32DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service32.model.Model32;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service32 {

    private final Entity32DatasourcePort datasource;

    public Service32(Entity32DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model32 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
