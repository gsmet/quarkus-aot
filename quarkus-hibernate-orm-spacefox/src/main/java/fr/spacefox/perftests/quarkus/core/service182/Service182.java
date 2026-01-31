package fr.spacefox.perftests.quarkus.core.service182;

import fr.spacefox.perftests.quarkus.core.port.data.Entity182DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service182.model.Model182;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service182 {

    private final Entity182DatasourcePort datasource;

    public Service182(Entity182DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model182 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
