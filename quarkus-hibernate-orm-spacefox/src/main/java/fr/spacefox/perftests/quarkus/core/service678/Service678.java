package fr.spacefox.perftests.quarkus.core.service678;

import fr.spacefox.perftests.quarkus.core.port.data.Entity678DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service678.model.Model678;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service678 {

    private final Entity678DatasourcePort datasource;

    public Service678(Entity678DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model678 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
