package fr.spacefox.perftests.quarkus.core.service686;

import fr.spacefox.perftests.quarkus.core.port.data.Entity686DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service686.model.Model686;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service686 {

    private final Entity686DatasourcePort datasource;

    public Service686(Entity686DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model686 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
