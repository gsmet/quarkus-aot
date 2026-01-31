package fr.spacefox.perftests.quarkus.core.service180;

import fr.spacefox.perftests.quarkus.core.port.data.Entity180DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service180.model.Model180;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service180 {

    private final Entity180DatasourcePort datasource;

    public Service180(Entity180DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model180 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
