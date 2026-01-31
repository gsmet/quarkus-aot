package fr.spacefox.perftests.quarkus.core.service756;

import fr.spacefox.perftests.quarkus.core.port.data.Entity756DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service756.model.Model756;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service756 {

    private final Entity756DatasourcePort datasource;

    public Service756(Entity756DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model756 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
