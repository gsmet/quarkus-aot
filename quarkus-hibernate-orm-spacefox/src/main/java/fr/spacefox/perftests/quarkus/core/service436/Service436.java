package fr.spacefox.perftests.quarkus.core.service436;

import fr.spacefox.perftests.quarkus.core.port.data.Entity436DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service436.model.Model436;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service436 {

    private final Entity436DatasourcePort datasource;

    public Service436(Entity436DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model436 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
