package fr.spacefox.perftests.quarkus.core.service310;

import fr.spacefox.perftests.quarkus.core.port.data.Entity310DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service310.model.Model310;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service310 {

    private final Entity310DatasourcePort datasource;

    public Service310(Entity310DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model310 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
