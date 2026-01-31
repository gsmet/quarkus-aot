package fr.spacefox.perftests.quarkus.core.service152;

import fr.spacefox.perftests.quarkus.core.port.data.Entity152DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service152.model.Model152;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service152 {

    private final Entity152DatasourcePort datasource;

    public Service152(Entity152DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model152 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
