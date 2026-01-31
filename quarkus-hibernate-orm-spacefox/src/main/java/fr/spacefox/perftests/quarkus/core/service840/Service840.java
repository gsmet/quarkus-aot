package fr.spacefox.perftests.quarkus.core.service840;

import fr.spacefox.perftests.quarkus.core.port.data.Entity840DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service840.model.Model840;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service840 {

    private final Entity840DatasourcePort datasource;

    public Service840(Entity840DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model840 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
