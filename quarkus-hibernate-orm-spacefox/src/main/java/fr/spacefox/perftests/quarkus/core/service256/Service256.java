package fr.spacefox.perftests.quarkus.core.service256;

import fr.spacefox.perftests.quarkus.core.port.data.Entity256DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service256.model.Model256;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service256 {

    private final Entity256DatasourcePort datasource;

    public Service256(Entity256DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model256 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
