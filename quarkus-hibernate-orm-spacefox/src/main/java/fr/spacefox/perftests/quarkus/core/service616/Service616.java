package fr.spacefox.perftests.quarkus.core.service616;

import fr.spacefox.perftests.quarkus.core.port.data.Entity616DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service616.model.Model616;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service616 {

    private final Entity616DatasourcePort datasource;

    public Service616(Entity616DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model616 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
