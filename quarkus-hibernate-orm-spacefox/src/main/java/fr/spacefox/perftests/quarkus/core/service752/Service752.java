package fr.spacefox.perftests.quarkus.core.service752;

import fr.spacefox.perftests.quarkus.core.port.data.Entity752DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service752.model.Model752;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service752 {

    private final Entity752DatasourcePort datasource;

    public Service752(Entity752DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model752 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
