package fr.spacefox.perftests.quarkus.core.service989;

import fr.spacefox.perftests.quarkus.core.port.data.Entity989DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service989.model.Model989;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service989 {

    private final Entity989DatasourcePort datasource;

    public Service989(Entity989DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model989 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
