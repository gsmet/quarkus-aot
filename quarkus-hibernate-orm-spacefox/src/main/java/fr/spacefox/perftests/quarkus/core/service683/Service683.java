package fr.spacefox.perftests.quarkus.core.service683;

import fr.spacefox.perftests.quarkus.core.port.data.Entity683DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service683.model.Model683;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service683 {

    private final Entity683DatasourcePort datasource;

    public Service683(Entity683DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model683 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
