package fr.spacefox.perftests.quarkus.core.service679;

import fr.spacefox.perftests.quarkus.core.port.data.Entity679DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service679.model.Model679;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service679 {

    private final Entity679DatasourcePort datasource;

    public Service679(Entity679DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model679 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
