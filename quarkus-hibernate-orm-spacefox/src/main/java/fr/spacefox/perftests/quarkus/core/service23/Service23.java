package fr.spacefox.perftests.quarkus.core.service23;

import fr.spacefox.perftests.quarkus.core.port.data.Entity23DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service23.model.Model23;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service23 {

    private final Entity23DatasourcePort datasource;

    public Service23(Entity23DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model23 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
