package fr.spacefox.perftests.quarkus.core.service935;

import fr.spacefox.perftests.quarkus.core.port.data.Entity935DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service935.model.Model935;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service935 {

    private final Entity935DatasourcePort datasource;

    public Service935(Entity935DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model935 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
