package fr.spacefox.perftests.quarkus.core.service176;

import fr.spacefox.perftests.quarkus.core.port.data.Entity176DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service176.model.Model176;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service176 {

    private final Entity176DatasourcePort datasource;

    public Service176(Entity176DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model176 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
