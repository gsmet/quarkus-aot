package fr.spacefox.perftests.quarkus.core.service594;

import fr.spacefox.perftests.quarkus.core.port.data.Entity594DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service594.model.Model594;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service594 {

    private final Entity594DatasourcePort datasource;

    public Service594(Entity594DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model594 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
