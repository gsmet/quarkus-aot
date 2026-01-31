package fr.spacefox.perftests.quarkus.core.service179;

import fr.spacefox.perftests.quarkus.core.port.data.Entity179DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service179.model.Model179;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service179 {

    private final Entity179DatasourcePort datasource;

    public Service179(Entity179DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model179 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
