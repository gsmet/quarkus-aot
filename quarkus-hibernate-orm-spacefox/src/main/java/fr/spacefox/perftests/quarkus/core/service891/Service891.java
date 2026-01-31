package fr.spacefox.perftests.quarkus.core.service891;

import fr.spacefox.perftests.quarkus.core.port.data.Entity891DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service891.model.Model891;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service891 {

    private final Entity891DatasourcePort datasource;

    public Service891(Entity891DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model891 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
