package fr.spacefox.perftests.quarkus.core.service582;

import fr.spacefox.perftests.quarkus.core.port.data.Entity582DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service582.model.Model582;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service582 {

    private final Entity582DatasourcePort datasource;

    public Service582(Entity582DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model582 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
