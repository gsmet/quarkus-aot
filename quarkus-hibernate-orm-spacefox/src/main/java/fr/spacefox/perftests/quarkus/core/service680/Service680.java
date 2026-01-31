package fr.spacefox.perftests.quarkus.core.service680;

import fr.spacefox.perftests.quarkus.core.port.data.Entity680DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service680.model.Model680;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service680 {

    private final Entity680DatasourcePort datasource;

    public Service680(Entity680DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model680 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
