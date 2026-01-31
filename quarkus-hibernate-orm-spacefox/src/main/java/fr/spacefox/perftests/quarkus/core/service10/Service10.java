package fr.spacefox.perftests.quarkus.core.service10;

import fr.spacefox.perftests.quarkus.core.port.data.Entity10DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service10.model.Model10;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service10 {

    private final Entity10DatasourcePort datasource;

    public Service10(Entity10DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model10 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
