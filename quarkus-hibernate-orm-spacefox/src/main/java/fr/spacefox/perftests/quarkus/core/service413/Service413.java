package fr.spacefox.perftests.quarkus.core.service413;

import fr.spacefox.perftests.quarkus.core.port.data.Entity413DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service413.model.Model413;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service413 {

    private final Entity413DatasourcePort datasource;

    public Service413(Entity413DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model413 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
