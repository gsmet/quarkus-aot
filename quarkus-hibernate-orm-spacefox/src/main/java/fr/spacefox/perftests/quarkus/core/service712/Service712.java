package fr.spacefox.perftests.quarkus.core.service712;

import fr.spacefox.perftests.quarkus.core.port.data.Entity712DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service712.model.Model712;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service712 {

    private final Entity712DatasourcePort datasource;

    public Service712(Entity712DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model712 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
