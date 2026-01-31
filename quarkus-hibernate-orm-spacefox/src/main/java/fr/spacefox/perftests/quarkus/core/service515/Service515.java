package fr.spacefox.perftests.quarkus.core.service515;

import fr.spacefox.perftests.quarkus.core.port.data.Entity515DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service515.model.Model515;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service515 {

    private final Entity515DatasourcePort datasource;

    public Service515(Entity515DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model515 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
