package fr.spacefox.perftests.quarkus.core.service119;

import fr.spacefox.perftests.quarkus.core.port.data.Entity119DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service119.model.Model119;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service119 {

    private final Entity119DatasourcePort datasource;

    public Service119(Entity119DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model119 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
