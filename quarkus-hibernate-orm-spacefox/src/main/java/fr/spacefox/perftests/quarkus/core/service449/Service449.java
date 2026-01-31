package fr.spacefox.perftests.quarkus.core.service449;

import fr.spacefox.perftests.quarkus.core.port.data.Entity449DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service449.model.Model449;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service449 {

    private final Entity449DatasourcePort datasource;

    public Service449(Entity449DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model449 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
