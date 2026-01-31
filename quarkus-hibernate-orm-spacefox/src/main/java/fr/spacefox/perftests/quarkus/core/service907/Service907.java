package fr.spacefox.perftests.quarkus.core.service907;

import fr.spacefox.perftests.quarkus.core.port.data.Entity907DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service907.model.Model907;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service907 {

    private final Entity907DatasourcePort datasource;

    public Service907(Entity907DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model907 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
