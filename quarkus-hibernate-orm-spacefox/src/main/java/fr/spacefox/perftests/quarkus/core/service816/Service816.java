package fr.spacefox.perftests.quarkus.core.service816;

import fr.spacefox.perftests.quarkus.core.port.data.Entity816DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service816.model.Model816;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service816 {

    private final Entity816DatasourcePort datasource;

    public Service816(Entity816DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model816 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
