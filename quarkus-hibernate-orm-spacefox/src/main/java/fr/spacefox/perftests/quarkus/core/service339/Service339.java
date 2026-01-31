package fr.spacefox.perftests.quarkus.core.service339;

import fr.spacefox.perftests.quarkus.core.port.data.Entity339DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service339.model.Model339;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service339 {

    private final Entity339DatasourcePort datasource;

    public Service339(Entity339DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model339 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
