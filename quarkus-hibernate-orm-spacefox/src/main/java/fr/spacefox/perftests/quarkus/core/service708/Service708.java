package fr.spacefox.perftests.quarkus.core.service708;

import fr.spacefox.perftests.quarkus.core.port.data.Entity708DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service708.model.Model708;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service708 {

    private final Entity708DatasourcePort datasource;

    public Service708(Entity708DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model708 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
