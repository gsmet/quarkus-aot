package fr.spacefox.perftests.quarkus.core.service899;

import fr.spacefox.perftests.quarkus.core.port.data.Entity899DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service899.model.Model899;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service899 {

    private final Entity899DatasourcePort datasource;

    public Service899(Entity899DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model899 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
